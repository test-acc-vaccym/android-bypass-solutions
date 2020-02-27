package com.nuvent.shareat.api.friend;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.nuvent.shareat.api.ApiUrl;
import com.nuvent.shareat.api.Request;
import com.nuvent.shareat.model.friend.FriendStatusModel;
import io.fabric.sdk.android.services.network.HttpRequest;
import org.apache.http.Header;

public class FriendStatusApi extends Request {
    public FriendStatusApi(Context context) {
        super(context);
        this.method = HttpRequest.METHOD_POST;
        this.serviceUrl = ApiUrl.FRIEND_LIST;
    }

    /* access modifiers changed from: protected */
    public Object parseContent(Header[] headers, String responseText) throws Exception {
        return (FriendStatusModel) new Gson().fromJson((JsonElement) new JsonParser().parse(responseText).getAsJsonObject(), FriendStatusModel.class);
    }

    /* access modifiers changed from: protected */
    public Object parseErrorCode(String responseText) throws Exception {
        return null;
    }
}