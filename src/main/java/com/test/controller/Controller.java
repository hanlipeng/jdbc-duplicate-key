package com.test.controller;

import com.test.dao.TestDAO;
import com.test.entity.Test;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanlipeng
 * @date 2019-05-31
 */
@RestController
public class Controller {


    @Autowired
    private TestDAO testDAO;

    @GetMapping("/test")
    public List<Test> insert(@RequestParam List<Integer> keys) {
        List<Test> tests = keys.stream().map(key -> {

            Test test = new Test();
            test.setKeyId(key);
            test.setTime(System.currentTimeMillis());
            return test;
        }).collect(Collectors.toList());
        testDAO.insertOnDuplicateKeyUpdate(tests);
        return tests;
    }

}
