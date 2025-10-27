package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class App2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("*** Teste 1 : Department findById ***");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println();
        System.out.println("*** Teste 2 : Department findAll ***");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("*** Teste 3 : Department insert ***");
        Department newDepartment = new Department(null, null);
        departmentDao.insert(newDepartment);
        System.out.println("Inserido! novo Departamento = " + newDepartment.getName());

        System.out.println();
        System.out.println("*** Teste 4 : Department update ***");
        dep = departmentDao.findById(6);
        dep.setName("Ti");
        departmentDao.update(dep);
        System.out.println("Update completo!");


        System.out.println();
        System.out.println("*** Teste 5 : Department delete ***");
        System.out.println("Digite um 'ID' para o teste de deleção: ");
        int id = sc.nextInt();
        departmentDao.deletById(id);
        System.out.println("Deletado com sucesso!");
        sc.close();
    }
}
