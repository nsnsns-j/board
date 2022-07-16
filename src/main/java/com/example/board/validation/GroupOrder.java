package com.example.board.validation;

import javax.validation.GroupSequence;

//GroupSequence アノテーションで Group1.class 、Group2.class の順でチェックするように指定

@GroupSequence({ Group1.class, Group2.class })
public interface GroupOrder {

}
