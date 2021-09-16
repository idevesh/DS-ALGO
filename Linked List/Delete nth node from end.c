// C program to delete the nth node of linkedlist from end
//

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    struct ListNode* slow = head;
    struct ListNode* fast = head;
    struct ListNode* ahead = head->next;
    
    int size = 1;
    int current = 1;
    
    // Find mid of List to find size
    while(fast != NULL && fast->next != NULL){
        size++;
        slow = slow->next;
        fast = fast->next->next;
    }
    
    // Find size of list from mid value
    if(fast == NULL) {
        size = (size-1)*2;
    } else if(fast->next == NULL){
        size = (size*2) - 1;
    }
  
    /*************** Corner cases ************/
    slow = head;
    if(size == 1 && n == 1){
        return NULL;
    } else if (size != 1 && n == 1){
        while(ahead->next != NULL) {
            slow = slow->next;
            ahead = ahead->next;
        }
        slow->next = NULL;
        return head;
    } else if(size != 1 && n == size){
        head = head -> next;
        return head;
    }
    /*************** Corner cases END *********/
  
    /*************** Remove node in between *********/
    slow = head;
    // Remove nth Node
    for(int i = 0; i < (size-n)-1; i++){
        slow = slow->next;
        ahead = ahead->next;
    }
    slow->next = ahead->next;
    return head;
    /*************** Remove node in between *********/
}
