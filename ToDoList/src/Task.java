
import java.sql.Date;

public class Task {

    private int id;
    private String taskName;
    private String taskStatus;
    private String taskDate;

    public Task(int id, String taskName, String taskDate,String taskStatus) {
        this.id = id;
        this.taskName = taskName;
        this.taskDate = taskDate;
        this.taskStatus = taskStatus;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + getId() + ", task Name=" + getTaskName() + ", task Date=" + getTaskDate() +  " taskStatus is "+getTaskStatus()+'}';
    }

    public String toStringSaveFile() {
        return getId() + ";" + getTaskName() + ";" + getTaskDate() +  ";"+getTaskStatus()+ System.getProperty("line.separator");
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName the taskName to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * @return the taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * @param taskStatus the taskStatus to set
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * @return the taskDate
     */
    public String getTaskDate() {
        return taskDate;
    }

    /**
     * @param taskDate the taskDate to set
     */
    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }
    
}
