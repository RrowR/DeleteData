package com.study.delete.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  atlan 2022/1/20 22:55 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ods_nanpu_paper_question")
public class OdsNanpuPaperQuestion {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 试卷 ID
     */
    @TableField(value = "paper_id")
    private String paperId;

    /**
     * 试卷名称
     */
    @TableField(value = "paper_name")
    private String paperName;

    /**
     * 试卷满分
     */
    @TableField(value = "paper_score")
    private Double paperScore;

    /**
     * 试卷考试学科 ID
     */
    @TableField(value = "exam_subject_id")
    private String examSubjectId;

    /**
     * 试卷试题 ID
     */
    @TableField(value = "paper_question_id")
    private String paperQuestionId;

    /**
     * 试题名称
     */
    @TableField(value = "question_title")
    private String questionTitle;

    /**
     * 试题基础学科 ID
     */
    @TableField(value = "base_subject_id")
    private String baseSubjectId;

    /**
     * 试题序号
     */
    @TableField(value = "question_no")
    private String questionNo;

    /**
     * 试题根试题 ID
     */
    @TableField(value = "question_root_id")
    private String questionRootId;

    /**
     * 试题父试题 ID
     */
    @TableField(value = "question_parent_id")
    private String questionParentId;

    /**
     * 试题是否判分点，1 是，0 不是
     */
    @TableField(value = "`question_is_correct_po int`")
    private Boolean questionIsCorrectPoInt;

    /**
     * 试题排序序号
     */
    @TableField(value = "question_sequence")
    private String questionSequence;

    /**
     * 试题类型 ID
     */
    @TableField(value = "question_type_id")
    private String questionTypeId;

    /**
     * 试题类型名称
     */
    @TableField(value = "question_type_name")
    private String questionTypeName;

    /**
     * 试题满分
     */
    @TableField(value = "question_score")
    private Double questionScore;

    /**
     * 是否选做题
     */
    @TableField(value = "is_chose_question")
    private Byte isChoseQuestion;

    /**
     * 试题知识点,以逗号分隔
     */
    @TableField(value = "question_knowledge")
    private String questionKnowledge;

    /**
     * 选做题组内题目数目
     */
    @TableField(value = "question_num")
    private Integer questionNum;

    /**
     * 选做题内选做的题目数目， 比如 3 选 2， question_num = 3, chosen_question_num = 2
     */
    @TableField(value = "chosen_question_num")
    private Integer chosenQuestionNum;
}