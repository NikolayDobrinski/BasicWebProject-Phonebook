package phonebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import phonebook.entity.Contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ContactController {
    private List<Contact> contacts;

    public ContactController() {
        this.contacts = new ArrayList<>();

                //Arrays.asList(
                //new Contact("Peter", "0889123123"),
                //new Contact("George", "0889456456")

        //);
    }

    @GetMapping("/")
    public ModelAndView getAll(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("contacts", this.contacts);

        return modelAndView;
    }

    @PostMapping("/")
    public String save(Contact contact) {
        this.contacts.add(contact);

        return "redirect:/";
    }
}
