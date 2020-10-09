package com.teenyda.mapping.base;

import java.util.List;

import com.teenyda.domain.Contact;
/**
*  @author mymx.banner
*/
public interface ContactBaseMapper {

    int insertContact(Contact object);

    int updateContact(Contact object);

    int update(Contact.UpdateBuilder object);

    List<Contact> queryContact(Contact object);

    Contact queryContactLimit1(Contact object);

}