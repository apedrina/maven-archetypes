package ${package};

import ${pakcage}.config.FeingConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "services-ms", url = "#{'someurl.com'}", contextId = "client-ms", configuration = FeingConfig.class)
public interface OtherMSClient {

    @GetMapping("caminho/{id}")
    ResponseEntity<List<String>> getById(@PathVariable String id);

}