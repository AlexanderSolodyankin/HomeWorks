package com.company;

import com.Connectors.GroupStudents.ConnectSQL_Group;
import com.Connectors.GroupStudents.GroupSQL_Setter;

public class TaskB {
    public static void main(String[] args) {
        ConnectSQL_Group group = new GroupSQL_Setter();

        for (int i = 0; i < group.getAll().size(); i++) {
            System.out.println(group.getAll().get(i));
        }

    }
}
/*
create table students_group(
id serial primary key,
group_name varchar not null unique
);

insert into students_group(group_name)
values ('JV-W21'), ('FE-W21'),('MD-F20');
commit;
select * from students_group;

create table students(
id serial primary key,
student_name varchar not null,
student_group integer references students_group(id)
);

insert into students(student_name, student_group)
values ('Pasha', 1),('Masha',2), ('Lera ',3), ('Ksysha',1),
('Misha',2),('Ashat',3),('Kostya',1),('Kirill',2),('Sasha',3),
('Ker_Tak',1),('SolRa',2),('Lilit',3),('Tor',1),('Fenrir',2),
('Grogu',3),('Asoka',1),('Anakin',2),('ObVan',3),('Yoda',1);
commit;
select * from students_group ;
select * from students ;


select count(*) from students s
join students_group sg on sg.id = s.student_group
where  sg.group_name = 'JV-W21';
 */