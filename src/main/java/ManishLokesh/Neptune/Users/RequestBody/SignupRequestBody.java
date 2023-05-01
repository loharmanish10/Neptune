package ManishLokesh.Neptune.Users.RequestBody;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class SignupRequestBody {

    @NotNull(message = "fullName is not null")
    @NotBlank(message = "fullName is not blank")
    private String fullName;

    @NotNull(message = "mobile Number is not null")
    @NotBlank(message = "mobile number is not blank")
    private String mobileNumber;

    @NotNull(message = "email ID is not null")
    @NotBlank(message = "email ID is not blank")
    private String emailId;

    @NotNull(message = "Gender is not null")
    @NotBlank(message = "Gender is not blank")
    private String gender;
    @NotNull(message = "Password is not null")
    @NotBlank(message = "Password is not blank")
    private String password;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
