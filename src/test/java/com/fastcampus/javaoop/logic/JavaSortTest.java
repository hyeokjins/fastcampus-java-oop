package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @DisplayName("자바 정렬 테스트 - 리스트를 넣으면 결과 출력")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        JavaSort<Integer> javaSort = new JavaSort<>();

        List<Integer> actual = javaSort.sort(List.of(3,6,1,4,7,2,5));

        assertEquals(List.of(1,2,3,4,5,6,7), actual);
    }
}