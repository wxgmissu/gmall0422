package com.sgm.gmall.user.service;



import com.sgm.gmall.user.bean.UmsMember;
import com.sgm.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
