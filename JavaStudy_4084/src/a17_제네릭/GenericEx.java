package a17_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GenericEx<T> { // T안에 넣는 변수 --- 제네릭
	private T data;
}
