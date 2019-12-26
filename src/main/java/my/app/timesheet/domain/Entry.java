package my.app.timesheet.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "Each Time sheet entry")
public class Entry {

    @ApiModelProperty(name = "Id", dataType = "Number", required = false, value = "Time sheet entry identification number")
    private Long Id;

    @ApiModelProperty(name = "Task Identifier", dataType = "String", required = true, value = "The reference id to the task currently working on, eg: Jira ID")
    private String taskId;

    @ApiModelProperty(name = "Task Description", dataType = "String", required = true, value = "")
    private String taskDesc;

    /**
     * Field to record the date and time when we start doing the specified task
     * */
    private Date startDate;

    /**
     * Field to record the date and time when we completed the specified task
     * */
    private Date endDate;

    /**
     * Field to record the total time we spent on the specified task
     * */
    private Date totalTimeTaken;

    /**
     * Field to store any comments regarding the task, like the status, pending task and
     * if needed modified file names for future reference
     * */
    private String comments;

}
