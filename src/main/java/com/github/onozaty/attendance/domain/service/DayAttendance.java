package com.github.onozaty.attendance.domain.service;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DayAttendance {

    private LocalDate date;

    private List<UserAttendance> users;
}
