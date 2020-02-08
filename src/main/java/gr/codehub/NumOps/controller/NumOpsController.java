package gr.codehub.NumOps.controller;

import gr.codehub.NumOps.service.NumHistoryService;
import gr.codehub.NumOps.service.OperationService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@RequestMapping
public class NumOpsController {

    OperationService operationService = new OperationService();
    NumHistoryService numHistoryService = new NumHistoryService();

    @GetMapping("{num1},{num2}")
    public String twoNumberOperationsController(@PathVariable("num1") int a,
                                                @PathVariable("num2") int b) throws IOException {
        numHistoryService.saveToHistory(a, b);
        return operationService.getOperations(a, b);
    }


    @GetMapping("history")
    public StringBuilder historyController() throws IOException {
        return numHistoryService.history("history.txt");
    }
}

////////////////////////////////////////////////////////////////////////////
////DYNAMIC URI's
////           @RequestMapping(value = "/fetch/{id}", method = RequestMethod.GET)
////            String getDynamicUriValue(@PathVariable int num1){
////                return ;
////            }

