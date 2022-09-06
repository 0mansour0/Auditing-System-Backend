package com.example.auditing.repositories.dummytables;

import com.example.auditing.models.dummytables.ApplicationModel;
import com.example.auditing.repositories.base.BaseRepository;

public interface ApplicationJpaRepository extends BaseRepository<ApplicationModel,Long> {
    ApplicationModel findByAppName(String name);
}
