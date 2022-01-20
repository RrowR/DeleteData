package com.study.delete.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * atlan 2022/1/20 22:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OdsVo {

    private String code;
    private String message;
    private OdsVo2 data;

    @Data
    class OdsVo2 {
        List<OdsVo3> paper_list;
    }

    @Data
    class OdsVo3 {
        String paper_id;
        String paper_name;
        String paper_score;
        String exam_subject_id;
        List<OdsVo4> question_list;
        List<OdsVo5> chosen_group_list;
    }

    @Data
    class OdsVo4 {
        String paper_question_id;
        String question_title;
        String base_subject_id;
        String question_no;
        String question_root_id;
        String question_parent_id;
        String question_is_correct_point;
        String question_sequence;
        String question_type_id;
        String question_type_name;
        String question_score;
        String is_chose_question;
        String question_knowledge;
    }

    @Data
    class OdsVo5 {
        String question_num;
        String chosen_question_num;
        String question_ids;
    }


}
