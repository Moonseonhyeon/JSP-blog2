package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Reply;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReplyResponseDto {
	private Reply reply;
	private String username;
	private String userProfile;
}
