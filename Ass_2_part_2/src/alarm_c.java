
public class alarm_c {

	public boolean Status;
	public String Time;
	public String Message;

	public boolean getStatus() {
		return Status;
	}

	public String getTime() {
		return Time;
	}

	public String getMessage() {
		return Message;
	}

	// default
	public alarm_c() {
		Status = true;
		Time = "5am";
		Message = "No message";
	}
	// Manual alarm set

	public alarm_c(boolean Status, String Time, String Message) {
		this.Status = Status;
		this.Time = Time;
		this.Message = Message;
	}

	//Method
	public boolean getStatus(boolean Status) {
		return Status;
	}
	public String getTime(String Time) {
		return Time;
	}
	public String getMessage(String Message) {
		return Message;
	}
	public void setStatus(boolean Status) {
		this.Status = Status;
	}
	public void setTime(String Time) {
		this.Time = Time;
	}
	public void setMessage(String Message) {
		this.Message = Message;
	}
	public String toString() {
		return Status + "\n" + Time + "\n" + Message;
	}
}