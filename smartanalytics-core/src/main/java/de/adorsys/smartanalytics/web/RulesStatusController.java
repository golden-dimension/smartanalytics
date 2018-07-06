package de.adorsys.smartanalytics.web;

import de.adorsys.smartanalytics.api.ConfigStatus;
import de.adorsys.smartanalytics.core.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/status")
public class RulesStatusController {

    @Autowired
    private StatusService statusService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Resource<ConfigStatus> status() {
        return new Resource(statusService.getStatus());
    }


}
