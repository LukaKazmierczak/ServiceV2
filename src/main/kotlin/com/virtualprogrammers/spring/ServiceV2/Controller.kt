package com.virtualprogrammers.spring.ServiceV2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView

@Controller
class Controller {

    @Autowired
        lateinit var description: Description



        @RequestMapping("")
        fun Title(): ModelAndView = ModelAndView("Speiseeis","bean",bean() )
        @RequestMapping(value = arrayOf("Verfügbarkeitsprüfung"), method = arrayOf(RequestMethod.POST))
        fun homepage(bean: bean): ModelAndView{
            val selectedCombination = description.price(bean.selectedKugeln,bean.selectedIce,bean.selectedTopping)
            val selectedObjects = description.map
            return ModelAndView("Gewählte Kombination", "bean","$selectedObjects zum Preis von $selectedCombination")
        }
        @RequestMapping(value = arrayOf("räsentation"), method = arrayOf(RequestMethod.GET))
        fun show(): ModelAndView = ModelAndView("Sortiment", "bean","${description.listIce}${description.listTopping}")
        @RequestMapping(value = arrayOf("löschung"), method = arrayOf(RequestMethod.DELETE))
        fun remove(bean: bean): ModelAndView{
            description.remover(bean.Eissorten,bean.topping)
            return ModelAndView("Liste", "bean", "${bean.Eissorten}${bean.topping}")
        }
        @RequestMapping(value = arrayOf("Hinzufügen"), method = arrayOf(RequestMethod.PUT))
        fun adder(bean: bean): ModelAndView{
            description.adder(bean.topping,bean.Eissorten)
            return ModelAndView("Neue Liste", "bean", "${bean.Eissorten}${bean.topping}")
        }




        class bean(){
            var Eissorten = arrayOf("Erdbeereis","Schokoladeneis","Vanilleeis")
            var soßen = arrayOf("Schokoladensoße","Erdbeersoße","Vanillesoße")
            var Kugeln = 1..10
            var topping = arrayOf("Sahne ","Streusel", soßen)
            var selectedKugeln = 1
            var selectedTopping = ""
            var selectedIce = ""
            var result = ""

    }    }


