package Model;

import Entity.Address;

/**
 * Created by Thanh Ha on 4/6/2017.
 */
public interface AddrDAO {
    boolean intsert(Address  employee);
    boolean delete(int id);
    Address find(int id);
}
