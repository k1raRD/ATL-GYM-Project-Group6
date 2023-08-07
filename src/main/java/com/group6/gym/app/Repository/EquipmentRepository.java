package com.group6.gym.app.Repository;
import com.group6.gym.app.Entities.Equipment;

import java.util.List;

public interface EquipmentRepository {
    List<Equipment> getAll();
    Equipment findById(Long id);
    void guardar(Equipment equipment);
    void actualizar(Equipment equipment);
    void eliminar(Long id);

}