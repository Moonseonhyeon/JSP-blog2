package dto;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Board;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetailResponseDto {
	private Board board;
	private String username;
}
