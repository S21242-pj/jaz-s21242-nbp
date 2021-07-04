package pl.edu.pjatk.jazs21242nbp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.edu.pjatk.jazs21242nbp.repository.RepositoryNbp;

@Service
public class ServiceNbp {

    private final RestTemplate restTemplate;
    private final RepositoryNbp repositoryNbp;

    public ServiceNbp(RestTemplate restTemplate, RepositoryNbp repositoryNbp) {
        this.restTemplate = restTemplate;
        this.repositoryNbp = repositoryNbp;
    }



}
