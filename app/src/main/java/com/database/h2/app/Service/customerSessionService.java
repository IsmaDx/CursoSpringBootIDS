package com.database.h2.app.Service;

import java.util.List;

import com.database.h2.app.View.customerSession;

public interface customerSessionService {
List<customerSession> openSession();
    customerSession oSession(String customerNumber) throws Exception;
}
