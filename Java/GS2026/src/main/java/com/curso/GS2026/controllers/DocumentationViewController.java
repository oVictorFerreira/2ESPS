package com.curso.GS2026.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/docs")
public class DocumentationViewController {

    @GetMapping()
    public String docs() {
        return "index";
    }

    @GetMapping("satellites")
    public String satelliteDocs() {
        return "docs/docs-satellites";
    }

    @GetMapping("operators")
    public String operatorDocs() {
        return "docs/docs-operators";
    }

    @GetMapping("materials")
    public String materialDocs() {
        return "docs/docs-materials";
    }

}
