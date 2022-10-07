package id.com.ninja.dojo.usersmanagementservice.Dto;

import id.com.ninja.dojo.usersmanagementservice.Model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateUserResponeDto implements Serializable {
    private User user;
}
