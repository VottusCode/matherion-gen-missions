export interface Difficulty {
  id: number;
  mission_name: string;
  mission_difficulty: string;
}

export interface Mission {
  mission_name: string;
  mission_task: string;
  icon: string;
  prize: string;
  note: string;
}
