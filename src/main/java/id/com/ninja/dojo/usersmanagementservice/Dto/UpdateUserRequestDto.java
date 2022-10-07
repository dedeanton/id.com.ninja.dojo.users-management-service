package id.com.ninja.dojo.usersmanagementservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateUserRequestDto implements Serializable {
    private int id;
    private String Username;
    private int RoleId;
    private String Email;
    private String Password;
    private int Status;

}
