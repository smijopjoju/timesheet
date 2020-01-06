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

    @ApiModelProperty(name = "Task Description", dataType = "String", required = true, value = "Short description about the code task")
    private String taskDesc;


    @ApiModelProperty(name = "Start Date", dataType = "String", required = true, value = "Date and time when we start doing the specified task")
    private Date startDate;

    @ApiModelProperty(name = "End Date", dataType = "String", required = true, value = "Date and time when we completed the specified task")
    private Date endDate;

    @ApiModelProperty(name = "Total time spend on the task", dataType = "String", required = true, value = "Capture the total time we spent on the specified task")
    private Date totalTimeTaken;

    @ApiModelProperty(name = "Comments", dataType = "String", required = true, value = "Comments regarding the task, like the status, pending task and, " +
            "if needed modified file names for future reference")
    private String comments;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getTotalTimeTaken() {
        return totalTimeTaken;
    }
}
