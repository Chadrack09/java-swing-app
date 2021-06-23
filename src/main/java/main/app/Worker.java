package main.app;
/**
 *
 * @author Chadrack
 */
public class Worker implements Comparable<Worker> {
  private String title;
  private String firstName;
  private String lastName;
  private String gender;
  private boolean isPension;

  public Worker(String title, String firstName, String lastName, String gender, boolean isPension) {
    this.title = title;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.isPension = isPension;
  }

  public String getTitle() {
    return title;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getGender() {
    return gender;
  }

  public boolean isIsPension() {
    return isPension;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setIsPension(boolean isPension) {
    this.isPension = isPension;
  }

  @Override
  public String toString() {
    return "Worker{" + "title=" + title + ", first_name=" + firstName + ", last_name=" + lastName + ", gender=" + gender + ", isPension=" + isPension + '}';
  }

  @Override
  public int compareTo(Worker o) {
    return lastName.compareTo(o.lastName);
  }
}
