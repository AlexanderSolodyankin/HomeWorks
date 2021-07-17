package com.company;

import com.Connectors.Treners.InterfaceTrener;
import com.Connectors.Treners.TrenersSQL;

public class TaskA {
    public static void main(String[] args) {
        InterfaceTrener treners = new TrenersSQL();
        int wages = 0;

        for (int i = 0; i < treners.getAll().size(); i++) {
            System.out.println(treners.getAll().get(i));
            wages += treners.getAll().get(i).getWages();
        }
        System.out.println("Итоговая зарплата: " + wages);
    }
}
/*
create table treners(
id serial primary key,
trener_name varchar not null,
trener_sername varchar not null,
wages integer not null
);

insert into treners(trener_name, trener_sername, wages)
values
('Alexander', 'Harongton', 23000),
('Vladimir', 'Pogonov', 13000),
('Elena', 'Nogorosova', 43000),
('Ruslan', 'Lipnikov', 3000),
('Roku', 'yo', 14000);
commit;

select * from treners;
 */
