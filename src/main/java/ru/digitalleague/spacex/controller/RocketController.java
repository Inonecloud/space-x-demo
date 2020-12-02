package ru.digitalleague.spacex.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.spacex.service.RocketService;
import ru.digitalleague.spacex.service.dto.RocketDto;
import ru.digitalleague.spacex.service.dto.RocketWithStatusDto;

@RestController
@RequestMapping("/rocket")
public class RocketController {

    private RocketService rocketService;

    public RocketController(RocketService rocketService) {
        this.rocketService = rocketService;
    }


    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewRocket(@RequestBody RocketDto rocket){
        rocketService.addRocket(rocket);
    }

    @GetMapping("/change_status/{status}/{id}")
    public ResponseEntity<RocketWithStatusDto> changeStatus(@PathVariable String status, @PathVariable Integer id){
        var rocketWithStatusDto = rocketService.changeStatus(status, id);
        return new ResponseEntity<RocketWithStatusDto>(rocketWithStatusDto, HttpStatus.OK);
    }

    @GetMapping("/get_rocket")
    public ResponseEntity<RocketWithStatusDto> getRocket(){
        var rocketForNasa = rocketService.getRocketForNasa();
        return new ResponseEntity<RocketWithStatusDto>(rocketForNasa, HttpStatus.OK);
    }

}
