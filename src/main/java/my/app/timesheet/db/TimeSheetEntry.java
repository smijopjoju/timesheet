package my.app.timesheet.db;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "timesheetentry")
public class TimeSheetEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    /**
    * Field to store custom task ID references, like Jira ID
    * */
    private String taskId;

    /**
     * Field to store small description about the task
     * */
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

    public Date getTotalTimeTaken() {
        return totalTimeTaken;
    }

    public void setTotalTimeTaken(Date totalTimeTaken) {
        this.totalTimeTaken = totalTimeTaken;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeSheetEntry that = (TimeSheetEntry) o;
        return Objects.equals(Id, that.Id) &&
                Objects.equals(taskId, that.taskId) &&
                Objects.equals(taskDesc, that.taskDesc) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(totalTimeTaken, that.totalTimeTaken) &&
                Objects.equals(comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, taskId, taskDesc, startDate, endDate, totalTimeTaken, comments);
    }

    @Override
    public String toString() {
        return "TimeSheetEntry{" +
                "Id=" + Id +
                ", taskId='" + taskId + '\'' +
                ", taskDesc='" + taskDesc + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalTimeTaken=" + totalTimeTaken +
                ", comments='" + comments + '\'' +
                '}';
    }
}
