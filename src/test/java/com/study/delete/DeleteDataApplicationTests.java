package com.study.delete;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.study.delete.domain.Money;
import com.study.delete.service.MoneyService;
import com.study.delete.service.impl.MoneyServiceImpl;
import com.study.delete.vo.OdsVo;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.logging.Logger;

@SpringBootTest
@MapperScan("com.study.delete.mapper")
class DeleteDataApplicationTests {

    @Autowired
    private MoneyService moneyService;

    @Test
    void contextLoads() {
        boolean save = moneyService.save(Money.builder()
                .count(new BigDecimal(11.1))
                .build());
        System.out.println(save);
    }

    @Test
    void Test02() {
        String jsonStr = "{\n" +
                "    \"code\": 0,\n" +
                "    \"message\": \"\",\n" +
                "    \"data\": {\n" +
                "        \"paper_list\": [\n" +
                "            {\n" +
                "                \"paper_id\": 0,\n" +
                "                \"paper_name\": \"\",\n" +
                "                \"paper_score\": 0,\n" +
                "                \"exam_subject_id\": 0,\n" +
                "                \"question_list\": [\n" +
                "                    {\n" +
                "                        \"paper_question_id\": 0,\n" +
                "                        \"question_title\": \"\",\n" +
                "                        \"base_subject_id\": 0,\n" +
                "                        \"question_no\": \"\",\n" +
                "                        \"question_root_id\": 0,\n" +
                "                        \"question_parent_id\": 0,\n" +
                "                        \"question_is_correct_point\": 0,\n" +
                "                        \"question_sequence\": 0,\n" +
                "                        \"question_type_id\": 0,\n" +
                "                        \"question_type_name\": \"\",\n" +
                "                        \"question_score\": 0,\n" +
                "                        \"is_chose_question\": 0,\n" +
                "                        \"question_knowledge\": \"\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"chosen_group_list\": [\n" +
                "                    {\n" +
                "                        \"question_num\": 0,\n" +
                "                        \"chosen_question_num\": 0,\n" +
                "                        \"question_ids\": \"\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        JSONObject paper_list = jsonObject.getJSONObject("data");
        JSONArray jsonArray = paper_list.getJSONArray("paper_list");
        JSONObject jsonObject1 = ((JSONObject) jsonArray.get(0));
        Integer paper_score = jsonObject1.getInteger("paper_score");
        System.out.println(paper_score);
        JSONArray chosen_group_list = jsonObject1.getJSONArray("chosen_group_list");
        System.out.println(chosen_group_list);
        JSONArray question_list = jsonObject1.getJSONArray("question_list");
        for (int i = 0; i < question_list.size(); i++) {
            System.out.println("question_list.get(i) = " + question_list.get(i));
        }
        JSONObject jsonObject3 = question_list.getJSONObject(0);
        String question_ids = jsonObject3.getString("question_ids");
        System.out.println("question_ids = " + question_ids);
        Integer question_num = jsonObject3.getInteger("question_num");
        System.out.println("question_num = " + question_num);
        Integer paper_id = jsonObject1.getInteger("paper_id");
        System.out.println(paper_id);
        JSONObject jsonObject2 = (JSONObject) question_list.get(0);
        Integer question_type_id = jsonObject2.getInteger("question_type_id");
        System.out.println(question_type_id);
        JSONObject question_knowledge = jsonObject2.getJSONObject("question_knowledge");
        System.out.println(question_knowledge);
        Object paper_id1 = jsonObject1.get("paper_id");
        System.out.println(paper_id1);


    }


    @Test
    void Test03() {

    }

}
