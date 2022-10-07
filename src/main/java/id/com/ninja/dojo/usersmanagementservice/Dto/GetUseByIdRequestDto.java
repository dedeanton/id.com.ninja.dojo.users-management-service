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
public class GetUseByIdRequestDto implements Serializable {
    private int id;

}
