package ma.mundia.bdccprojectspringmvc.web;

import ma.mundia.bdccprojectspringmvc.Entites.Product;
import ma.mundia.bdccprojectspringmvc.respostory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class productControlleur {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/index")
    public String index(Model model){
        List<Product> produit= productRepository.findAll();
        model.addAttribute("produitList",produit);
        return "product";
    }
}
