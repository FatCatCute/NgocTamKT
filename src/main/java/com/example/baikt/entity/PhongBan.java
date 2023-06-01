package com.example.baikt.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name ="PhongBan")
public class PhongBan {
    @Id
    @Column(name = "Ma_Phong")
    private String Ma_Phong;

    @Column(name= "Ten_Phong")
    private String Ten_Phong;

    @OneToMany(mappedBy = "phongBan" ,cascade = CascadeType.ALL)
    private List<NhanVien> nhanVien;
}
