package com.example.dictionaryvocabimprovement;

import com.example.dictionaryvocabimprovement.Models.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse apiResponse,String message);
    void onError(String message);
}
