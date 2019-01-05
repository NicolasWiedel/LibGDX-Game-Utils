package com.entity.script;

import com.entity.EntityBase;

/**
 * Created by Nicolas Wiedel on 05.01.2019.
 */
public interface EntityScript<T extends EntityBase> {

    void added(T entity);

    void removed(T removed);

    void update(float delta);

    boolean isFinished();
}
