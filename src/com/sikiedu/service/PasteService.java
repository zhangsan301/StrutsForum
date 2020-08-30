package com.sikiedu.service;

import com.sikiedu.dao.PasteDao;
import com.sikiedu.domain.Paste;

import java.sql.SQLException;
import java.util.List;

public class PasteService {

     public List<Paste> findAllPaste() throws SQLException {
         PasteDao pasteDao=new PasteDao();
         return pasteDao.findAllPaste();

     }



}
