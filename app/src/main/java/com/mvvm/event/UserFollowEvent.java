package com.mvvm.event;

import android.view.View;

public interface UserFollowEvent {
    void follow(View view);
    void unFollow(View view);
}
