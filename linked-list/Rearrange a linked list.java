   //  The task is to complete this method
          Node odd = head;
          Node even_head = head.next;
          Node even = head.next;
          Node cur = head;
          Node temp =null;
          int c = 1;
          int n =1;
          int e=1;
          while(cur!=null)
          {
              temp = cur.next;
              if(c%2!=0)
              {
                  if(n==1)
                  {
                      odd =head;
                      n++;
                      
                  }
                  else
                  {
                       odd.next = cur;
                       odd = cur;
                  }
                   
              }
              else
              {
                  if(e==1)
                  {
                      e++;
                      continue;
                  }
                  else
                  {
                      even.next = cur;
                      even = cur;
                  }
              }
              cur = temp;
              c++;
          }
          even.next = null;
          odd.next = even_head;
          return head;
