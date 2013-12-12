package com.zmaxim.dao;

import com.zmaxim.entity.shop.Group;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mzavgorodny
 * Date: 02.03.13
 * Time: 17:04
 * To change this template use File | Settings | File Templates.
 */
public interface GroupDao {

    void saveOrUpdateGroup(Group group);

    List<Group> getAllGroupsIntoDatabase();

    Group getGroupById(Long id);
}
