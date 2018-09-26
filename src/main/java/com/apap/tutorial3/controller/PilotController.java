package com.apap.tutorial3.controller;
import java.util.List;

import javax.xml.ws.Response;

import com.apap.tutorial3.model.PilotModel;
import com.apap.tutorial3.service.PilotService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PilotController{
    @Autowired
    private PilotService pilotService;

    @RequestMapping("/pilot/add")
    public String add(@RequestParam(value="id", required=true) String id,
                    @RequestParam(value="licenseNumber", required=true) String licenseNumber,
                    @RequestParam(value="name", required=true) String name,
                    @RequestParam(value="flyHour", required=true) int flyHour){

                        PilotModel pilot = new PilotModel(id, licenseNumber, name,flyHour);
                        pilotService.addPilot(pilot);
                        return "add";
    }

    @RequestMapping("/pilot/view")
    public String view(@RequestParam("licenseNumber") String licenseNumber, Model model){
        PilotModel archive = pilotService.getPilotByLicenseNumber(licenseNumber);
        System.out.println(archive.getId());
        model.addAttribute("pilot", archive);
        return "view-pilot";
    }

    @RequestMapping("/pilot/viewall")
    public String viewall(Model model){
        List<PilotModel> archive = pilotService.getPilotList();

        model.addAttribute("pilotList", archive);
        return "viewall-pilot";
    }

    @RequestMapping(value={"/pilot/view/license-number/{licenseNumber}"})
    public String viewPath(@PathVariable (value="licenseNumber", required=false) String licenseNumber, Model model){
        PilotModel pilot = pilotService.getPilotByLicenseNumber(licenseNumber);
        model.addAttribute("pilot",pilot);
        return "view-path";
    }

    @RequestMapping("/pilot/update/license-number/{licenseNumber}/fly-hour/{flyHour}")
    public String edit( @PathVariable (value="licenseNumber", required=true) String licenseNumber, 
                        @PathVariable (value="flyHour", required=true) Integer flyHour, Model model){
        
        String response = "Gagal mengubah data pilot!";
        PilotModel pilot = pilotService.getPilotByLicenseNumber(licenseNumber);
        if (pilot != null) {
            pilot.setFlyHour(flyHour);
            response = "Berhasil mengubah data pilot!";
        }
        model.addAttribute("response", response);
        return "edit";
    }

    @RequestMapping("/pilot/delete/id/{id}")
    public String delete (@PathVariable (value="id", required=true) String id, Model model){
        String response = "Gagal menghapus data pilot!";
        if(pilotService.removePilot(id)){
            response= "Berhasil menghapus data pilot";
        }
        model.addAttribute("response", response);
        return "edit";
    }
    
    
}