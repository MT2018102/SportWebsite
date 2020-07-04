package com.test.product.controllers;

import com.test.product.beans.Product;
import com.test.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.async.DeferredResult;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

@Controller
public class SearchController {
    private static Logger sportyLogger =
            Logger.getLogger(SearchController.class.getName());
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private AsyncTaskExecutor asyncTaskExecutor;

    @GetMapping("/search")
    public DeferredResult<String> search(@RequestParam("search") String search,
                                         Model model, HttpServletRequest request){
        DeferredResult<String> deferredResult = new DeferredResult<>();
        sportyLogger.info("I am in Search Controller..");
        sportyLogger.info("Search Criteria"+ search);
        sportyLogger.info("Spring boot provides this support as "+
                            request.isAsyncSupported());
        sportyLogger.info("Thread from the servlet container: "+
                Thread.currentThread().getName());

        asyncTaskExecutor.execute(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sportyLogger.info("Thread from the springMVC Task executor: "+
                    Thread.currentThread().getName());
            List<Product> products = new ArrayList<>();
            products = productRepository.searchByName(search);
            model.addAttribute("products", products);
            deferredResult.setResult("search");
        });
        return deferredResult;
    }
}
