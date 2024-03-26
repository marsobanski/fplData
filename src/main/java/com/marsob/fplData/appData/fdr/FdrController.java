package com.marsob.fplData.appData.fdr;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fdr")
@RequiredArgsConstructor
public class FdrController {
    private final FdrMatrixCreator fdrMatrixCreator;

    @GetMapping("/all")
    public String getAllStandard() {
        try {
            FdrMatrix matrix = fdrMatrixCreator.create();
            return "DONE";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
