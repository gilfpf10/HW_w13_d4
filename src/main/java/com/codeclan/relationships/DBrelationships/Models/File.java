package com.codeclan.relationships.DBrelationships.Models;

import javax.persistence.*;

@Entity

@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "name")
    private String extenssion;

    @Column(name = "size")
    private int size;

    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;

    public File(String name, String extenssion, int size, Folder folder) {
        this.name = name;
        this.extenssion = extenssion;
        this.size = size;
        this.folder = folder;
    }

    public File(){


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtenssion() {
        return extenssion;
    }

    public void setExtenssion(String extenssion) {
        this.extenssion = extenssion;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
