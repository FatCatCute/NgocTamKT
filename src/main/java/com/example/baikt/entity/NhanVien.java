package com.example.baikt.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="NhanVien")
public class NhanVien {
    @Id
    @Column
    private String Ma_NV;

    @Column
    private String Ten_NV;

    @Column
    private String Phai;

    @Column
    private String Noi_Sinh;

    @ManyToOne
    @JoinColumn(name = "MaPhongBan" , referencedColumnName = "Ma_Phong")
    private PhongBan phongBan;

    @Column
    private  Integer Luong;

}
