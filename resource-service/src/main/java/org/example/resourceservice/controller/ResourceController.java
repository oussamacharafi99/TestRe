package org.example.resourceservice.controller;

import org.example.resourceservice.model.Resource;
import org.example.resourceservice.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @PostMapping("save")
    public String save(@RequestBody Resource resource) {
        resourceService.save(resource);
        return "The resource has been saved";
    }

    @PutMapping("update/{id}")
    public String update(@PathVariable Integer id, @RequestBody Resource resource) {
        resourceService.update(id, resource);
        return "The resource has been updated";
    }

    @GetMapping("get+all")
    public List<Resource> getAll() {
        return resourceService.findAll();
    }

    @GetMapping("get+id/{id}")
    public Resource get(@PathVariable Integer id) {
        return resourceService.findById(id);
    }

    @GetMapping("get_all_resources_by_task_id/{task_id}")
    public List<Resource> getAllResources(@PathVariable Integer task_id) {
        return resourceService.getAllResourcesByTaskId(task_id);
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        resourceService.delete(id);
        return "The resource has been deleted";
    }
}
